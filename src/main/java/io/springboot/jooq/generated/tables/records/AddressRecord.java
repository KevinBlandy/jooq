/*
 * This file is generated by jOOQ.
 */
package io.springboot.jooq.generated.tables.records;


import io.springboot.jooq.generated.tables.Address;
import io.springboot.jooq.generated.tables.interfaces.IAddress;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 地址
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record4<UInteger, LocalDateTime, String, UInteger>, IAddress {

    private static final long serialVersionUID = 959382188;

    /**
     * Setter for <code>jooq.address.id</code>. 地址id
     */
    @Override
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.address.id</code>. 地址id
     */
    @Override
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jooq.address.created_date</code>. 创建时间
     */
    @Override
    public void setCreatedDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.address.created_date</code>. 创建时间
     */
    @Override
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>jooq.address.name</code>. 详细地址
     */
    @Override
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq.address.name</code>. 详细地址
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq.address.user_id</code>. 用户id
     */
    @Override
    public void setUserId(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq.address.user_id</code>. 用户id
     */
    @Override
    public UInteger getUserId() {
        return (UInteger) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UInteger, LocalDateTime, String, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UInteger, LocalDateTime, String, UInteger> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Address.ADDRESS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Address.ADDRESS.CREATED_DATE;
    }

    @Override
    public Field<String> field3() {
        return Address.ADDRESS.NAME;
    }

    @Override
    public Field<UInteger> field4() {
        return Address.ADDRESS.USER_ID;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedDate();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public UInteger component4() {
        return getUserId();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedDate();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public UInteger value4() {
        return getUserId();
    }

    @Override
    public AddressRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public AddressRecord value2(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public AddressRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public AddressRecord value4(UInteger value) {
        setUserId(value);
        return this;
    }

    @Override
    public AddressRecord values(UInteger value1, LocalDateTime value2, String value3, UInteger value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IAddress from) {
        setId(from.getId());
        setCreatedDate(from.getCreatedDate());
        setName(from.getName());
        setUserId(from.getUserId());
    }

    @Override
    public <E extends IAddress> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressRecord
     */
    public AddressRecord() {
        super(Address.ADDRESS);
    }

    /**
     * Create a detached, initialised AddressRecord
     */
    public AddressRecord(UInteger id, LocalDateTime createdDate, String name, UInteger userId) {
        super(Address.ADDRESS);

        set(0, id);
        set(1, createdDate);
        set(2, name);
        set(3, userId);
    }
}
