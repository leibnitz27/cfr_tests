package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Logger;

import java.io.File;

public class AllatoriTest1 {
    private static final Logger log = null;

    interface TreeEntity<T> {
        String getIdColumnName();
        String getIdAttrName();
    }


    public String updateTreeLeaf(TreeEntity<?> entity) {
        long time = System.currentTimeMillis();
        StringBuilder sql = new StringBuilder();
        TreeEntity<?> treeEntity = entity;
        String idColumnName = treeEntity.getIdColumnName();
        String idAttrName = treeEntity.getIdAttrName();
        String tableName = MapperHelper.getTableName(MapperHelper.getTable(treeEntity), entity);
        sql.append("UPDATE ");
        sql.append(tableName);
        sql.append(" SET");
        sql.append(" tree_leaf = (");
        sql.append(" SELECT tree_leaf FROM (");
        sql.append(" SELECT (case when count(1) > 0 then '0' else '1' end) tree_leaf");
        sql.append(" FROM " + tableName);
        sql.append(" WHERE status = '0'");
        sql.append(" AND parent_code = #{" + idAttrName + "}");
        sql.append(" ) a");
        sql.append(" )");
        sql.append(" WHERE");
        sql.append(" " + idColumnName + " = #{" + idAttrName + "}");
        String string = sql.toString();
        if (log.isDebugEnabled()) {
            log.debug(TimeUtils.formatDateAgo((System.currentTimeMillis() - time)) + ": " + string);
        }
        return string;
    }

}

class MapperHelper {
    static String getTableName(Object o, Object o2) {return "a";}
    static Object getTable(Object s) { return null;}
}

class TimeUtils {

    public static String formatDateAgo(long l) {
        return "x";
    }
}