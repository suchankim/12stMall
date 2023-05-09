package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long productId;
    private Integer qty;
    private String orderStatus;
    private String address;
    private String productName;
}
