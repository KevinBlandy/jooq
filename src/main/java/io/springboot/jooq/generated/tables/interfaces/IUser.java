/*
 * This file is generated by jOOQ.
 */
package io.springboot.jooq.generated.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 用户
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IUser extends Serializable {

    /**
     * Setter for <code>jooq.user.id</code>. 用户id
     */
    public void setId(UInteger value);

    /**
     * Getter for <code>jooq.user.id</code>. 用户id
     */
    public UInteger getId();

    /**
     * Setter for <code>jooq.user.created_date</code>. 创建时间
     */
    public void setCreatedDate(LocalDateTime value);

    /**
     * Getter for <code>jooq.user.created_date</code>. 创建时间
     */
    public LocalDateTime getCreatedDate();

    /**
     * Setter for <code>jooq.user.gender</code>. 性别。0：女，1：男
     */
    public void setGender(UByte value);

    /**
     * Getter for <code>jooq.user.gender</code>. 性别。0：女，1：男
     */
    public UByte getGender();

    /**
     * Setter for <code>jooq.user.name</code>. 昵称
     */
    public void setName(String value);

    /**
     * Getter for <code>jooq.user.name</code>. 昵称
     */
    public String getName();

    /**
     * Setter for <code>jooq.user.paren_id</code>. 父级用户
     */
    public void setParenId(UInteger value);

    /**
     * Getter for <code>jooq.user.paren_id</code>. 父级用户
     */
    public UInteger getParenId();

    /**
     * Setter for <code>jooq.user.version</code>. 版本号
     */
    public void setVersion(UInteger value);

    /**
     * Getter for <code>jooq.user.version</code>. 版本号
     */
    public UInteger getVersion();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUser
     */
    public void from(IUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUser
     */
    public <E extends IUser> E into(E into);
}
