package pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNull() {
            addCriterion("oldPrice is null");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNotNull() {
            addCriterion("oldPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOldpriceEqualTo(Long value) {
            addCriterion("oldPrice =", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotEqualTo(Long value) {
            addCriterion("oldPrice <>", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThan(Long value) {
            addCriterion("oldPrice >", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("oldPrice >=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThan(Long value) {
            addCriterion("oldPrice <", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThanOrEqualTo(Long value) {
            addCriterion("oldPrice <=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIn(List<Long> values) {
            addCriterion("oldPrice in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotIn(List<Long> values) {
            addCriterion("oldPrice not in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceBetween(Long value1, Long value2) {
            addCriterion("oldPrice between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotBetween(Long value1, Long value2) {
            addCriterion("oldPrice not between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNull() {
            addCriterion("conditions is null");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNotNull() {
            addCriterion("conditions is not null");
            return (Criteria) this;
        }

        public Criteria andConditionsEqualTo(String value) {
            addCriterion("conditions =", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotEqualTo(String value) {
            addCriterion("conditions <>", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThan(String value) {
            addCriterion("conditions >", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("conditions >=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThan(String value) {
            addCriterion("conditions <", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThanOrEqualTo(String value) {
            addCriterion("conditions <=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLike(String value) {
            addCriterion("conditions like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotLike(String value) {
            addCriterion("conditions not like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsIn(List<String> values) {
            addCriterion("conditions in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotIn(List<String> values) {
            addCriterion("conditions not in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsBetween(String value1, String value2) {
            addCriterion("conditions between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotBetween(String value1, String value2) {
            addCriterion("conditions not between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNull() {
            addCriterion("sellerId is null");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNotNull() {
            addCriterion("sellerId is not null");
            return (Criteria) this;
        }

        public Criteria andSelleridEqualTo(Integer value) {
            addCriterion("sellerId =", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotEqualTo(Integer value) {
            addCriterion("sellerId <>", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThan(Integer value) {
            addCriterion("sellerId >", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerId >=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThan(Integer value) {
            addCriterion("sellerId <", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThanOrEqualTo(Integer value) {
            addCriterion("sellerId <=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridIn(List<Integer> values) {
            addCriterion("sellerId in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotIn(List<Integer> values) {
            addCriterion("sellerId not in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridBetween(Integer value1, Integer value2) {
            addCriterion("sellerId between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerId not between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNull() {
            addCriterion("sellerName is null");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNotNull() {
            addCriterion("sellerName is not null");
            return (Criteria) this;
        }

        public Criteria andSellernameEqualTo(String value) {
            addCriterion("sellerName =", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotEqualTo(String value) {
            addCriterion("sellerName <>", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThan(String value) {
            addCriterion("sellerName >", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThanOrEqualTo(String value) {
            addCriterion("sellerName >=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThan(String value) {
            addCriterion("sellerName <", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThanOrEqualTo(String value) {
            addCriterion("sellerName <=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLike(String value) {
            addCriterion("sellerName like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotLike(String value) {
            addCriterion("sellerName not like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameIn(List<String> values) {
            addCriterion("sellerName in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotIn(List<String> values) {
            addCriterion("sellerName not in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameBetween(String value1, String value2) {
            addCriterion("sellerName between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotBetween(String value1, String value2) {
            addCriterion("sellerName not between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayIsNull() {
            addCriterion("sellerContactWay is null");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayIsNotNull() {
            addCriterion("sellerContactWay is not null");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayEqualTo(Integer value) {
            addCriterion("sellerContactWay =", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayNotEqualTo(Integer value) {
            addCriterion("sellerContactWay <>", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayGreaterThan(Integer value) {
            addCriterion("sellerContactWay >", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerContactWay >=", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayLessThan(Integer value) {
            addCriterion("sellerContactWay <", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayLessThanOrEqualTo(Integer value) {
            addCriterion("sellerContactWay <=", value, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayIn(List<Integer> values) {
            addCriterion("sellerContactWay in", values, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayNotIn(List<Integer> values) {
            addCriterion("sellerContactWay not in", values, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayBetween(Integer value1, Integer value2) {
            addCriterion("sellerContactWay between", value1, value2, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactwayNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerContactWay not between", value1, value2, "sellercontactway");
            return (Criteria) this;
        }

        public Criteria andSellercontactIsNull() {
            addCriterion("sellerContact is null");
            return (Criteria) this;
        }

        public Criteria andSellercontactIsNotNull() {
            addCriterion("sellerContact is not null");
            return (Criteria) this;
        }

        public Criteria andSellercontactEqualTo(String value) {
            addCriterion("sellerContact =", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactNotEqualTo(String value) {
            addCriterion("sellerContact <>", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactGreaterThan(String value) {
            addCriterion("sellerContact >", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactGreaterThanOrEqualTo(String value) {
            addCriterion("sellerContact >=", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactLessThan(String value) {
            addCriterion("sellerContact <", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactLessThanOrEqualTo(String value) {
            addCriterion("sellerContact <=", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactLike(String value) {
            addCriterion("sellerContact like", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactNotLike(String value) {
            addCriterion("sellerContact not like", value, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactIn(List<String> values) {
            addCriterion("sellerContact in", values, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactNotIn(List<String> values) {
            addCriterion("sellerContact not in", values, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactBetween(String value1, String value2) {
            addCriterion("sellerContact between", value1, value2, "sellercontact");
            return (Criteria) this;
        }

        public Criteria andSellercontactNotBetween(String value1, String value2) {
            addCriterion("sellerContact not between", value1, value2, "sellercontact");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}