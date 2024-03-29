/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.SortedSet;

/**
 *
 * @author JuanCamilo
 */
class ComplexInsertSentence extends SQLSentence {

    public ComplexInsertSentence(String joinTableName, String origin, String destinantion,
            SortedSet<PropertyNeo4J> originProps, SortedSet<PropertyNeo4J> destinantionProps,
            String label) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS Label (label_id INT(11) AUTO_INCREMENT,"
                + " label_name VARCHAR(255) UNIQUE, PRIMARY KEY (label_id,label_name)); ");
        sb.append("INSERT INTO Label (label_name) VALUES (\"");
        sb.append(label);
        sb.append("\"); ");
        sb.append("SET @label := (select Label.label_id from Label where Label.label_name=\"");
        sb.append(label);
        sb.append("\" limit 1); ");
        sb.append("SET @origin :=(select ");
        sb.append(origin);
        sb.append(".");
        sb.append(origin.toLowerCase());
        sb.append("_id from ");
        sb.append(origin);
        sb.append(" where ");
        sb.append(getConditions(origin, originProps));
        sb.append(" limit 1) ; ");

        sb.append("SET @destination :=(select ");
        sb.append(destinantion);
        sb.append(".");
        sb.append(destinantion.toLowerCase());
        sb.append("_id from ");
        sb.append(destinantion);
        sb.append(" where ");
        sb.append(getConditions(destinantion, destinantionProps));
        sb.append(" limit 1) ; ");
        sb.append("INSERT INTO ");
        sb.append(joinTableName);

        sb.append(" (");
        sb.append(joinTableName);
        sb.append(".origin,");
        sb.append(joinTableName);
        sb.append(".destination,");
        sb.append(joinTableName);
        sb.append(".label");
        sb.append(" ) VALUES (@origin,@destination,@label); ");
        translation = sb.toString();
    }

}
