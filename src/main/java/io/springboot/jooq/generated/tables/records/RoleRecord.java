/*
 * This file is generated by jOOQ.
 */
package io.springboot.jooq.generated.tables.records;


import io.springboot.jooq.generated.tables.Role;
import io.springboot.jooq.generated.tables.interfaces.IRole;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> implements Record2<UInteger, String>, IRole {

    private static final long serialVersionUID = 53357019;

    /**
     * Setter for <code>jooq.role.id</code>. 角色id
     */
    @Override
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.role.id</code>. 角色id
     */
    @Override
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jooq.role.name</code>. 角色名称
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.role.name</code>. 角色名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UInteger, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UInteger, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Role.ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return Role.ROLE.NAME;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public RoleRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RoleRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoleRecord values(UInteger value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRole from) {
        setId(from.getId());
        setName(from.getName());
    }

    @Override
    public <E extends IRole> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(UInteger id, String name) {
        super(Role.ROLE);

        set(0, id);
        set(1, name);
    }
}
