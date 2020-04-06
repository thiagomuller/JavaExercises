package Model;

import javax.persistence.*;
import java.util.List;

public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="OrderId")
    public int orderId;

    @OneToMany(mappedBy = "CustomerId", cascade {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH,
        CascadeType.REFRESH})
    public List<Integer> customerId;
    public int employeeId;
    public int orderdate;
    public int shipperId;
}
