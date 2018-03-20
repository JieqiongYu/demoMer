package mer.entity;

import java.io.Serializable;
import net.sf.json.JSONObject;

/**
 * Entity for endPoint2.
 *
 * @author jieqiong.yu
 */
public class Entity2 implements Serializable {

    private static final long serialVersionUID = -1592726182467560248L;

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
