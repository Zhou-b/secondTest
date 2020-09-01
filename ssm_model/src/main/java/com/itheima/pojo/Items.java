package com.itheima.pojo;

import java.util.Date;
/**
 * @program: ssm_parent
 * @description: xxx
 * @author: Mr.Zhou
 * @create: 2020-08-31 17:58
 **/
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;

    public Items(Integer id, String name, Float price, String pic, Date createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.createtime = createtime;
        this.detail = detail;
    }

    public Items() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Float getPrice() {
        return this.price;
    }

    public String getPic() {
        return this.pic;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Items)) return false;
        final Items other = (Items) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$pic = this.getPic();
        final Object other$pic = other.getPic();
        if (this$pic == null ? other$pic != null : !this$pic.equals(other$pic)) return false;
        final Object this$createtime = this.getCreatetime();
        final Object other$createtime = other.getCreatetime();
        if (this$createtime == null ? other$createtime != null : !this$createtime.equals(other$createtime))
            return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !this$detail.equals(other$detail)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Items;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $pic = this.getPic();
        result = result * PRIME + ($pic == null ? 43 : $pic.hashCode());
        final Object $createtime = this.getCreatetime();
        result = result * PRIME + ($createtime == null ? 43 : $createtime.hashCode());
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        return result;
    }

    public String toString() {
        return "Items(id=" + this.getId() + ", name=" + this.getName() + ", price=" + this.getPrice() + ", pic=" + this.getPic() + ", createtime=" + this.getCreatetime() + ", detail=" + this.getDetail() + ")";
    }
}