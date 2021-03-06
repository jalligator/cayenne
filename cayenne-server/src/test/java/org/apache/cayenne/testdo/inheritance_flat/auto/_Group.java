package org.apache.cayenne.testdo.inheritance_flat.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_flat.GroupProperties;
import org.apache.cayenne.testdo.inheritance_flat.Role;
import org.apache.cayenne.testdo.inheritance_flat.User;

/**
 * Class _Group was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Group extends User {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<List<Role>> GROUP_MEMBERS = Property.create("groupMembers", List.class);
    public static final Property<GroupProperties> GROUP_PROPERTIES = Property.create("groupProperties", GroupProperties.class);


    protected Object groupMembers;
    protected Object groupProperties;

    public void addToGroupMembers(Role obj) {
        addToManyTarget("groupMembers", obj, true);
    }

    public void removeFromGroupMembers(Role obj) {
        removeToManyTarget("groupMembers", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Role> getGroupMembers() {
        return (List<Role>)readProperty("groupMembers");
    }

    public void setGroupProperties(GroupProperties groupProperties) {
        setToOneTarget("groupProperties", groupProperties, true);
    }

    public GroupProperties getGroupProperties() {
        return (GroupProperties)readProperty("groupProperties");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "groupMembers":
                return this.groupMembers;
            case "groupProperties":
                return this.groupProperties;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "groupMembers":
                this.groupMembers = val;
                break;
            case "groupProperties":
                this.groupProperties = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.groupMembers);
        out.writeObject(this.groupProperties);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.groupMembers = in.readObject();
        this.groupProperties = in.readObject();
    }

}
