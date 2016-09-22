/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

/**
 *
 * @author JuanCamilo
 */
public class Permutations {

    public static final int[] PC_1 = new int[]{
        57, 49, 41, 33, 25, 17, 9, 01,
        58, 50, 42, 34, 26, 18, 10, 02,
        59, 51, 43, 35, 27, 19, 11, 03,
        60, 52, 44, 36, 63, 55, 47, 39,
        31, 23, 15, 07, 62, 54, 46, 38,
        30, 22, 14, 06, 61, 53, 45, 37,
        29, 21, 13, 05, 28, 20, 12, 04
    };

    public static final int[] PC_2 = new int[]{
        14, 17, 11, 24, 01, 05, 03, 28,
        15, 06, 21, 10, 23, 19, 12, 04,
        26, 8, 16, 07, 27, 20, 13, 02,
        41, 52, 31, 37, 47, 55, 30, 40,
        51, 45, 33, 48, 44, 49, 39, 56,
        34, 53, 46, 42, 50, 36, 29, 32
    };

    public static final int[] IP = new int[]{
        58, 50, 42, 34, 26, 18, 10, 02,
        60, 52, 44, 36, 28, 20, 12, 04,
        62, 54, 46, 38, 30, 22, 14, 06,
        64, 56, 48, 40, 32, 24, 16, 8,
        57, 49, 41, 33, 25, 17, 9, 01,
        59, 51, 43, 35, 27, 19, 11, 03,
        61, 53, 45, 37, 29, 21, 13, 05,
        63, 55, 47, 39, 31, 23, 15, 07
    };

    public static final int[] IP_INV = new int[]{
        40, 8, 48, 16, 56, 24, 64, 32,
        39, 07, 47, 15, 55, 23, 63, 31,
        38, 06, 46, 14, 54, 22, 62, 30,
        37, 05, 45, 13, 53, 21, 61, 29,
        36, 04, 44, 12, 52, 20, 60, 28,
        35, 03, 43, 11, 51, 19, 59, 27,
        34, 02, 42, 10, 50, 18, 58, 26,
        33, 01, 41, 9, 49, 17, 57, 25
    };
    public static final int[] E = new int[]{
        32, 01, 02, 03, 04, 05, 04, 05,
        06, 07, 8, 9, 8, 9, 10, 11,
        12, 13, 12, 13, 14, 15, 16, 17,
        16, 17, 18, 19, 20, 21, 20, 21,
        22, 23, 24, 25, 24, 25, 26, 27,
        28, 29, 28, 29, 30, 31, 32, 01
    };
    public static final int[] P = new int[]{
        16, 07, 20, 21, 29, 12, 28, 17,
        01, 15, 23, 26, 05, 18, 31, 10,
        02, 8, 24, 14, 32, 27, 03, 9,
        19, 13, 30, 06, 22, 11, 04, 25
    };

    public static final int[][] S1 = new int[][]{
        {14, 04, 13, 01, 02, 15, 11, 8, 03, 10, 06, 12, 05, 9, 00, 07},
        {0, 15, 07, 04, 14, 02, 13, 01, 10, 06, 12, 11, 9, 05, 03, 8},
        {04, 01, 14, 8, 13, 06, 02, 11, 15, 12, 9, 07, 03, 10, 05, 00},
        {15, 12, 8, 02, 04, 9, 01, 07, 005, 11, 03, 14, 10, 00, 06, 13}
    };
    public static final int[][] S2 = new int[][]{
        {15, 01, 8, 14, 06, 11, 03, 04, 9, 07, 02, 13, 12, 00, 05, 10},
        {03, 13, 04, 07, 15, 02, 8, 14, 12, 00, 01, 10, 06, 9, 11, 05},
        {00, 14, 07, 11, 10, 04, 13, 01, 05, 8, 12, 06, 9, 03, 02, 15},
        {13, 8, 10, 01, 03, 15, 04, 02, 11, 06, 07, 12, 00, 05, 14, 9}
    };
    public static final int[][] S3 = new int[][]{
        {10, 00, 9, 14, 06, 03, 15, 05, 01, 13, 12, 07, 11, 04, 02, 8},
        {13, 07, 00, 9, 03, 04, 06, 10, 02, 8, 05, 14, 12, 11, 15, 01},
        {13, 06, 04, 9, 8, 15, 03, 00, 11, 01, 02, 12, 05, 10, 14, 07},
        {01, 10, 13, 00, 06, 9, 8, 07, 04, 15, 14, 03, 11, 05, 02, 12}
    };
    public static final int[][] S4 = new int[][]{
        {07, 13, 14, 03, 00, 06, 9, 10, 01, 02, 8, 05, 11, 12, 04, 15},
        {13, 8, 11, 05, 06, 15, 00, 03, 04, 07, 02, 12, 01, 10, 14, 9},
        {10, 06, 9, 00, 12, 11, 07, 13, 15, 01, 03, 14, 05, 02, 8, 04},
        {03, 15, 00, 06, 10, 01, 13, 8, 9, 04, 05, 11, 12, 07, 02, 14}
    };
    public static final int[][] S5 = new int[][]{
        {02, 12, 04, 01, 07, 10, 11, 06, 8, 05, 03, 15, 13, 00, 14, 9},
        {14, 11, 02, 12, 04, 07, 13, 01, 05, 00, 15, 10, 03, 9, 8, 06},
        {04, 02, 01, 11, 10, 13, 07, 8, 15, 9, 12, 05, 06, 03, 00, 14},
        {11, 8, 12, 07, 01, 14, 02, 13, 06, 15, 00, 9, 1, 04, 05, 03}
    };
    public static final int[][] S6 = new int[][]{
        {12, 01, 10, 15, 9, 02, 06, 8, 00, 13, 03, 04, 14, 07, 05, 11},
        {10, 15, 04, 02, 07, 12, 9, 05, 06, 01, 13, 14, 00, 11, 03, 8},
        {9, 14, 15, 05, 02, 8, 12, 03, 07, 00, 04, 10, 01, 13, 11, 06},
        {04, 03, 02, 12, 9, 05, 15, 10, 11, 14, 01, 07, 06, 00, 8, 13}
    };
    public static final int[][] S7 = new int[][]{
        {04, 11, 02, 14, 15, 00, 8, 13, 03, 12, 9, 07, 05, 10, 06, 01},
        {13, 00, 11, 07, 04, 9, 01, 10, 14, 03, 05, 12, 02, 15, 8, 06},
        {01, 04, 11, 13, 12, 03, 07, 14, 10, 15, 06, 8, 00, 05, 9, 02},
        {06, 11, 13, 8, 01, 04, 10, 07, 9, 05, 00, 15, 14, 02, 03, 12}
    };
    public static final int[][] S8 = new int[][]{
        {13, 02, 8, 04, 06, 15, 11, 01, 10, 9, 03, 14, 05, 00, 12, 07},
        {01, 15, 13, 8, 10, 03, 07, 04, 12, 05, 06, 11, 00, 14, 9, 02},
        {07, 11, 04, 01, 9, 12, 14, 02, 00, 06, 10, 13, 15, 03, 05, 8},
        {02, 01, 14, 07, 04, 10, 8, 13, 15, 12, 9, 00, 03, 05, 06, 11}
    };

    public static final String[][] SB = new String[][]{
        {"63", "7c", "77", "7b", "f2", "6b", "6f", "c5", "30", "01", "67", "2b", "fe", "d7", "ab", "76"},
        {"ca", "82", "c9", "7d", "fa", "59", "47", "f0", "ad", "d4", "a2", "af", "9c", "a4", "72", "c0"},
        {"b7", "fd", "93", "26", "36", "3f", "f7", "cc", "34", "a5", "e5", "f1", "71", "d8", "31", "15"},
        {"04", "c7", "23", "c3", "18", "96", "05", "9a", "07", "12", "80", "e2", "eb", "27", "b2", "75"},
        {"09", "83", "2c", "1a", "1b", "6e", "5a", "a0", "52", "3b", "d6", "b3", "29", "e3", "2f", "84"},
        {"53", "d1", "00", "ed", "20", "fc", "b1", "5b", "6a", "cb", "be", "39", "4a", "4c", "58", "cf"},
        {"d0", "ef", "aa", "fb", "43", "4d", "33", "85", "45", "f9", "02", "7f", "50", "3c", "9f", "a8"},
        {"51", "a3", "40", "8f", "92", "9d", "38", "f5", "bc", "b6", "da", "21", "10", "ff", "f3", "d2"},
        {"cd", "0c", "13", "ec", "5f", "97", "44", "17", "c4", "a7", "7e", "3d", "64", "5d", "19", "73"},
        {"60", "81", "4f", "dc", "22", "2a", "90", "88", "46", "ee", "b8", "14", "de", "5e", "0b", "db"},
        {"e0", "32", "3a", "0a", "49", "06", "24", "5c", "c2", "d3", "ac", "62", "91", "95", "e4", "79"},
        {"e7", "c8", "37", "6d", "8d", "d5", "4e", "a9", "6c", "56", "f4", "ea", "65", "7a", "ae", "08"},
        {"ba", "78", "25", "2e", "1c", "a6", "b4", "c6", "e8", "dd", "74", "1f", "4b", "bd", "8b", "8a"},
        {"70", "3e", "b5", "66", "48", "03", "f6", "0e", "61", "35", "57", "b9", "86", "c1", "1d", "9e"},
        {"e1", "f8", "98", "11", "69", "d9", "8e", "94", "9b", "1e", "87", "e9", "ce", "55", "28", "df"},
        {"8c", "a1", "89", "0d", "bf", "e6", "42", "68", "41", "99", "2d", "0f", "b0", "54", "bb", "16"}
    };

    public static final String[][] SB_INV = new String[][]{
        {"52", "09", "6a", "d5", "30", "36", "a5", "38", "bf", "40", "a3", "9e", "81", "f3", "d7", "fb"},
        {"7c", "e3", "39", "82", "9b", "2f", "ff", "87", "34", "8e", "43", "44", "c4", "de", "e9", "cb"},
        {"54", "7b", "94", "32", "a6", "c2", "23", "3d", "ee", "4c", "95", "0b", "42", "fa", "c3", "4e"},
        {"08", "2e", "a1", "66", "28", "d9", "24", "b2", "76", "5b", "a2", "49", "6d", "8b", "d1", "25"},
        {"72", "f8", "f6", "64", "86", "68", "98", "16", "d4", "a4", "5c", "cc", "5d", "65", "b6", "92"},
        {"6c", "70", "48", "50", "fd", "ed", "b9", "da", "5e", "15", "46", "57", "a7", "8d", "9d", "84"},
        {"90", "d8", "ab", "00", "8c", "bc", "d3", "0a", "f7", "e4", "58", "05", "b8", "b3", "45", "06"},
        {"d0", "2c", "1e", "8f", "ca", "3f", "0f", "02", "c1", "af", "bd", "03", "01", "13", "8a", "6b"},
        {"3a", "91", "11", "41", "4f", "67", "dc", "ea", "97", "f2", "cf", "ce", "f0", "b4", "e6", "73"},
        {"96", "ac", "74", "22", "e7", "ad", "35", "85", "e2", "f9", "37", "e8", "1c", "75", "df", "6e"},
        {"47", "f1", "1a", "71", "1d", "29", "c5", "89", "6f", "b7", "62", "0e", "aa", "18", "be", "1b"},
        {"fc", "56", "3e", "4b", "c6", "d2", "79", "20", "9a", "db", "c0", "fe", "78", "cd", "5a", "f4"},
        {"1f", "dd", "a8", "33", "88", "07", "c7", "31", "b1", "12", "10", "59", "27", "80", "ec", "5f"},
        {"60", "51", "7f", "a9", "19", "b5", "4a", "0d", "2d", "e5", "7a", "9f", "93", "c9", "9c", "ef"},
        {"a0", "e0", "3b", "4d", "ae", "2a", "f5", "b0", "c8", "eb", "bb", "3c", "83", "53", "99", "61"},
        {"17", "2b", "04", "7e", "ba", "77", "d6", "26", "e1", "69", "14", "63", "55", "21", "0c", "7d"}
    };
    /** 
     * get from http://www.cs.utsa.edu/~wagner/laws/FFM.html
     * 
     */
    public static final String[][] GALOIS_E = new String[][]{
        {"01", "03", "05", "0f", "11", "33", "55", "ff", "1a", "2e", "72", "96", "a1", "f8", "13", "35"},
        {"5f", "e1", "38", "48", "d8", "73", "95", "a4", "f7", "02", "06", "0a", "1e", "22", "66", "aa"},
        {"e5", "34", "5c", "e4", "37", "59", "eb", "26", "6a", "be", "d9", "70", "90", "ab", "e6", "31"},
        {"53", "f5", "04", "0c", "14", "3c", "44", "cc", "4f", "d1", "68", "b8", "d3", "6e", "b2", "cd"},
        {"4c", "d4", "67", "a9", "e0", "3b", "4d", "d7", "62", "a6", "f1", "08", "18", "28", "78", "88"},
        {"83", "9e", "b9", "d0", "6b", "bd", "dc", "7f", "81", "98", "b3", "ce", "49", "db", "76", "9a"},
        {"b5", "c4", "57", "f9", "10", "30", "50", "f0", "0b", "1d", "27", "69", "bb", "d6", "61", "a3"},
        {"fe", "19", "2b", "7d", "87", "92", "ad", "ec", "2f", "71", "93", "ae", "e9", "20", "60", "a0"},
        {"fb", "16", "3a", "4e", "d2", "6d", "b7", "c2", "5d", "e7", "32", "56", "fa", "15", "3f", "41"},
        {"c3", "5e", "e2", "3d", "47", "c9", "40", "c0", "5b", "ed", "2c", "74", "9c", "bf", "da", "75"},
        {"9f", "ba", "d5", "64", "ac", "ef", "2a", "7e", "82", "9d", "bc", "df", "7a", "8e", "89", "80"},
        {"9b", "b6", "c1", "58", "e8", "23", "65", "af", "ea", "25", "6f", "b1", "c8", "43", "c5", "54"},
        {"fc", "1f", "21", "63", "a5", "f4", "07", "09", "1b", "2d", "77", "99", "b0", "cb", "46", "ca"},
        {"45", "cf", "4a", "de", "79", "8b", "86", "91", "a8", "e3", "3e", "42", "c6", "51", "f3", "0e"},
        {"12", "36", "5a", "ee", "29", "7b", "8d", "8c", "8f", "8a", "85", "94", "a7", "f2", "0d", "17"},
        {"39", "4b", "dd", "7c", "84", "97", "a2", "fd", "1c", "24", "6c", "b4", "c7", "52", "f6", "01"}
    };

    public static final String[][] GALOIS_L = new String[][]{
        {"00", "00", "19", "01", "32", "02", "1a", "c6", "4b", "c7", "1b", "68", "33", "ee", "df", "03"},
        {"64", "04", "e0", "0e", "34", "8d", "81", "ef", "4c", "71", "08", "c8", "f8", "69", "1c", "c1"},
        {"7d", "c2", "1d", "b5", "f9", "b9", "27", "6a", "4d", "e4", "a6", "72", "9a", "c9", "09", "78"},
        {"65", "2f", "8a", "05", "21", "0f", "e1", "24", "12", "f0", "82", "45", "35", "93", "da", "8e"},
        {"96", "8f", "db", "bd", "36", "d0", "ce", "94", "13", "5c", "d2", "f1", "40", "46", "83", "38"},
        {"66", "dd", "fd", "30", "bf", "06", "8b", "62", "b3", "25", "e2", "98", "22", "88", "91", "10"},
        {"7e", "6e", "48", "c3", "a3", "b6", "1e", "42", "3a", "6b", "28", "54", "fa", "85", "3d", "ba"},
        {"2b", "79", "0a", "15", "9b", "9f", "5e", "ca", "4e", "d4", "ac", "e5", "f3", "73", "a7", "57"},
        {"af", "58", "a8", "50", "f4", "ea", "d6", "74", "4f", "ae", "e9", "d5", "e7", "e6", "ad", "e8"},
        {"2c", "d7", "75", "7a", "eb", "16", "0b", "f5", "59", "cb", "5f", "b0", "9c", "a9", "51", "a0"},
        {"7f", "0c", "f6", "6f", "17", "c4", "49", "ec", "d8", "43", "1f", "2d", "a4", "76", "7b", "b7"},
        {"cc", "bb", "3e", "5a", "fb", "60", "b1", "86", "3b", "52", "a1", "6c", "aa", "55", "29", "9d"},
        {"97", "b2", "87", "90", "61", "be", "dc", "fc", "bc", "95", "cf", "cd", "37", "3f", "5b", "d1"},
        {"53", "39", "84", "3c", "41", "a2", "6d", "47", "14", "2a", "9e", "5d", "56", "f2", "d3", "ab"},
        {"44", "11", "92", "d9", "23", "20", "2e", "89", "b4", "7c", "b8", "26", "77", "99", "e3", "a5"},
        {"67", "4a", "ed", "de", "c5", "31", "fe", "18", "0d", "63", "8c", "80", "c0", "f7", "70", "07"}
    };

    public static FullBitSet PermutationP(FullBitSet k) {
        return permutation(k, P);
    }

    public static FullBitSet Expansion(FullBitSet k) {
        return permutation(k, E);
    }

    public static FullBitSet PC1(FullBitSet k) {
        return permutation(k, PC_1);
    }

    public static FullBitSet PC2(FullBitSet k) {
        return permutation(k, PC_2);
    }

    public static FullBitSet initialPermutation(FullBitSet k) {
        return permutation(k, IP);
    }

    public static FullBitSet initialPermutationINV(FullBitSet k) {
        return permutation(k, IP_INV);
    }

    private static FullBitSet permutation(FullBitSet k, int[] idxs) {
        FullBitSet bs = new FullBitSet(idxs.length);
        for (int i = 0; i < idxs.length; i++) {
            bs.set(i, k.get(idxs[i] - 1));
        }
        return bs;
    }

    public static FullBitSet S1(FullBitSet temp) {
        return applySBox(temp, S1);
    }

    public static FullBitSet S2(FullBitSet temp) {
        return applySBox(temp, S2);
    }

    public static FullBitSet S3(FullBitSet temp) {
        return applySBox(temp, S3);
    }

    public static FullBitSet S4(FullBitSet temp) {
        return applySBox(temp, S4);
    }

    public static FullBitSet S5(FullBitSet temp) {
        return applySBox(temp, S5);
    }

    public static FullBitSet S6(FullBitSet temp) {
        return applySBox(temp, S6);
    }

    public static FullBitSet S7(FullBitSet temp) {
        return applySBox(temp, S7);
    }

    public static FullBitSet S8(FullBitSet temp) {
        return applySBox(temp, S8);
    }

    private static FullBitSet applySBox(FullBitSet temp, int[][] SBox) {
        FullBitSet result;
        String bits = temp.toString();
        String r = bits.charAt(0) + "" + bits.charAt(bits.length() - 1);
        String c = bits.substring(1, bits.length() - 1);
        int row, col;
        row = Integer.parseInt(r, 2);
        col = Integer.parseInt(c, 2);
        String resultBits = Utils.toBinaryString(SBox[row][col], 4);
        result = Utils.bitsToBitSet(resultBits);
        return result;
    }

    private static String applySB(String hexIdx, String[][] mat) {
        char r, c;
        r = hexIdx.charAt(0);
        c = hexIdx.charAt(1);
        int row, column;
        row = Integer.parseInt(r + "", 16);
        column = Integer.parseInt(c + "", 16);
        return mat[row][column];
    }

    public static String applySB(String hexIdx) {
        return applySB(hexIdx, SB);
    }

    public static String applySBInv(String hexIdx) {
        return applySB(hexIdx, SB_INV);
    }

    public static String applyGaloisL(String hexIdx) {
        return applySB(hexIdx, GALOIS_L);
    }

    public static String applyGaloisE(String hexIdx) {
        return applySB(hexIdx, GALOIS_E);
    }
}
