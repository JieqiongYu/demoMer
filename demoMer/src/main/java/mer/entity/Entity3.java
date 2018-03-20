package mer.entity;

import java.io.Serializable;
import net.sf.json.JSONObject;

/**
 *
 * @author jieqiong.yu
 */
public class Entity3 implements Serializable {
    
    private static final long serialVersionUID = -3029465868227994338L;
    
    private int a;
    private double b;
    private boolean c;
    private int[] d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public int[] getD() {
        return d;
    }

    public void setD(int[] d) {
        this.d = d;
    }

    
    
    @Override
    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
    
}
