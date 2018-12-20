package pojo;

public class Item {
    private Integer id;

    private String title;

    private Long price;

    private Long oldprice;

    private String condition;

    private Integer sellerid;

    private String description;

    private String sellername;

    private Integer sellercontactway;

    private String sellercontact;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getOldprice() {
        return oldprice;
    }

    public void setOldprice(Long oldprice) {
        this.oldprice = oldprice;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public Integer getSellercontactway() {
        return sellercontactway;
    }

    public void setSellercontactway(Integer sellercontactway) {
        this.sellercontactway = sellercontactway;
    }

    public String getSellercontact() {
        return sellercontact;
    }

    public void setSellercontact(String sellercontact) {
        this.sellercontact = sellercontact == null ? null : sellercontact.trim();
    }
}