package org.apache.cayenne.lifecycle.db.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.lifecycle.db.AuditableChild1;

/**
 * Class _Auditable1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Auditable1 extends CayenneDataObject {

    public static final String CHAR_PROPERTY1_PROPERTY = "charProperty1";
    public static final String CHILDREN1_PROPERTY = "children1";

    public static final String ID_PK_COLUMN = "ID";

    public void setCharProperty1(String charProperty1) {
        writeProperty(CHAR_PROPERTY1_PROPERTY, charProperty1);
    }
    public String getCharProperty1() {
        return (String)readProperty(CHAR_PROPERTY1_PROPERTY);
    }

    public void addToChildren1(AuditableChild1 obj) {
        addToManyTarget(CHILDREN1_PROPERTY, obj, true);
    }
    public void removeFromChildren1(AuditableChild1 obj) {
        removeToManyTarget(CHILDREN1_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<AuditableChild1> getChildren1() {
        return (List<AuditableChild1>)readProperty(CHILDREN1_PROPERTY);
    }


}