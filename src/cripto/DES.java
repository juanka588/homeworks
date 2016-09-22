/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo
 */
public class DES {

    public static final int ENCODE = 0;
    public static final int DECODE = 1;

    public static void main(String[] args) {
        String message = "HOLA HOLA MI MUNDO";
        String key = "OCHOBITS";
        if (key.length() != 8) {
            System.out.println("bad key");
            return;
        }
        try {
            String cypher = encription(message, key);
            System.out.println("cypher: " + cypher);
            System.out.println("cypher hex: " + Utils.stringToHex(cypher));
            String decode = decode(cypher, key);
            System.out.println("decoded : " + decode);
            System.out.println("decoded hex: " + Utils.stringToHex(decode));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String process(String cad, String rawKey, int mode) throws UnsupportedEncodingException {
        List<String> blocks = Utils.splitString(cad, 8);
        List<FullBitSet> keys = generateKeys(rawKey);
        String mPermuted;
        FullBitSet m;
        String modBlock;
        StringBuilder sb = new StringBuilder();
        for (String block : blocks) {
            mPermuted = Utils.stringToHex(block);
            while (mPermuted.length() < 16) {
                mPermuted += '0';
            }
            mPermuted = Utils.hexToBytes(mPermuted);
            m = Utils.bitsToBitSet(mPermuted);
            modBlock = Utils.getStringValueOf(processBlock(m, keys, mode));
            sb.append(modBlock);
        }
        return sb.toString();
    }

    private static String encription(String message, String rawKey) throws UnsupportedEncodingException {
        return process(message, rawKey, ENCODE);
    }

    private static List<FullBitSet> generateKeys(String rawKey) {
        String hexKey = Utils.stringToHex(rawKey);
        FullBitSet k = Utils.bitsToBitSet(Utils.hexToBytes(hexKey));
        return generateKeys(k);
    }

    public static List<FullBitSet> generateKeys(FullBitSet k) {
        FullBitSet k0 = Permutations.PC1(k);
        List<FullBitSet> keys = new ArrayList<>();
        List<FullBitSet> parts = k0.split(28);
        FullBitSet c0 = parts.get(0);
        FullBitSet d0 = parts.get(1);
        FullBitSet ki;
        for (int i = 1; i <= 16; i++) {
            switch (i) {
                case 1:
                case 2:
                case 9:
                case 16:
                    c0 = c0.leftShift(1);
                    d0 = d0.leftShift(1);
                    break;
                default:
                    c0 = c0.leftShift(2);
                    d0 = d0.leftShift(2);
                    break;
            }
            ki = c0.fussion(d0);
            keys.add(Permutations.PC2(ki));
        }
        return keys;
    }

    private static FullBitSet applyfunction(FullBitSet pRight, FullBitSet key, FullBitSet pLeft) {
        FullBitSet response;
        FullBitSet expan = Permutations.Expansion(pRight);
        expan.xor(key);
        List<FullBitSet> split6 = expan.split6();
        List<FullBitSet> sboxes = new ArrayList<>(split6.size());
        FullBitSet sb, temp;
        for (int i = 0; i < split6.size(); i++) {
            temp = split6.get(i);
            switch (i) {
                case 0:
                    sb = Permutations.S1(temp);
                    break;
                case 1:
                    sb = Permutations.S2(temp);
                    break;
                case 2:
                    sb = Permutations.S3(temp);
                    break;
                case 3:
                    sb = Permutations.S4(temp);
                    break;
                case 4:
                    sb = Permutations.S5(temp);
                    break;
                case 5:
                    sb = Permutations.S6(temp);
                    break;
                case 6:
                    sb = Permutations.S7(temp);
                    break;
                case 7:
                    sb = Permutations.S8(temp);
                    break;
                default:
                    throw new IllegalAccessError("bad generation of split");
            }
            sboxes.add(sb);
        }
        response = FullBitSet.fussion(sboxes);
        response = Permutations.PermutationP(response);
        response.xor(pLeft);
        return response;
    }

    public static String decode(String cypher, String rawKey) throws UnsupportedEncodingException {
        return process(cypher, rawKey, DECODE);
    }

    public static FullBitSet processBlock(FullBitSet m, List<FullBitSet> keys, int mode) throws UnsupportedEncodingException {
        FullBitSet ip = Permutations.initialPermutation(m);
        FullBitSet left = null, pLeft, right = null, pRight;
        List<FullBitSet> splitHalf = ip.splitHalf();
        pLeft = splitHalf.get(0);
        pRight = splitHalf.get(1);
        FullBitSet key = null;
        for (int i = 0; i < keys.size(); i++) {
            if (ENCODE == mode) {
                key = keys.get(i);
            } else if (DECODE == mode) {
                key = keys.get(keys.size() - 1 - i);
            }
            left = pRight;
            right = applyfunction(pRight, key, pLeft);
            pLeft = left;
            pRight = right;
        }
        FullBitSet fussion = right.fussion(left);
        fussion = Permutations.initialPermutationINV(fussion);
        return fussion;
    }

}
