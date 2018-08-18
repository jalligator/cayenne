package org.apache.cayenne.crypto.db.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Table6 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Table6 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Long> CRYPTO_INT1 = Property.create("cryptoInt1", Long.class);
    public static final Property<Integer> CRYPTO_INT4 = Property.create("cryptoInt4", Integer.class);

    protected Long cryptoInt1;
    protected Integer cryptoInt4;


    public void setCryptoInt1(long cryptoInt1) {
        beforePropertyWrite("cryptoInt1", this.cryptoInt1, cryptoInt1);
        this.cryptoInt1 = cryptoInt1;
    }

    public long getCryptoInt1() {
        beforePropertyRead("cryptoInt1");
        if(this.cryptoInt1 == null) {
            return 0;
        }
        return this.cryptoInt1;
    }

    public void setCryptoInt4(int cryptoInt4) {
        beforePropertyWrite("cryptoInt4", this.cryptoInt4, cryptoInt4);
        this.cryptoInt4 = cryptoInt4;
    }

    public int getCryptoInt4() {
        beforePropertyRead("cryptoInt4");
        if(this.cryptoInt4 == null) {
            return 0;
        }
        return this.cryptoInt4;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cryptoInt1":
                return this.cryptoInt1;
            case "cryptoInt4":
                return this.cryptoInt4;
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
            case "cryptoInt1":
                this.cryptoInt1 = (Long)val;
                break;
            case "cryptoInt4":
                this.cryptoInt4 = (Integer)val;
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
        out.writeObject(this.cryptoInt1);
        out.writeObject(this.cryptoInt4);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cryptoInt1 = (Long)in.readObject();
        this.cryptoInt4 = (Integer)in.readObject();
    }

}