package pl.sobolewski.pizzaapp.remote.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.sobolewski.pizzaapp.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;
    private Date createdAt;
    private Date updatedAt;
    private Date expectedAt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;


    public OrderStatusDto() {
    }

    public OrderStatusDto(OrderStatusType status, Date createdAt, Date updatedAt, Date expectedAt, Date createdAt1, Date updatedAt1, Date expectedAt1) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
        this.createdAt = createdAt1;
        this.updatedAt = updatedAt1;
        this.expectedAt = expectedAt1;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
