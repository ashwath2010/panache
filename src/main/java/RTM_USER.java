import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
@Entity
public class RTM_USER extends PanacheEntity{
    public String COLUMN_NAME;
    public String DATA_TYPE;
    public String NULLABLE;
    public String DATA_DEFAULT;
    public int COLUMN_ID;
    public String COMMENTS;
}
