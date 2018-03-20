package mer.entity;

import java.io.Serializable;
import net.sf.json.JSONObject;

/**
 * Entity for endPoint1.
 *
 * @author jieqiong.yu
 */
public class Entity1 implements Serializable {

    private static final long serialVersionUID = -8512837713486610570L;

    private String entity;

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return JSONObject.fromObject(this).toString();
    }

}
