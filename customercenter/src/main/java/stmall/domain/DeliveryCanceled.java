package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private String productName;
    private Integer qty;
    private String status;
}
