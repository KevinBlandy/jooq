/*
 * This file is generated by jOOQ.
 */
package io.springboot.jooq.generated.tables.daos;


import io.springboot.jooq.generated.tables.Role;
import io.springboot.jooq.generated.tables.records.RoleRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class RoleDao extends DAOImpl<RoleRecord, io.springboot.jooq.generated.tables.pojos.Role, UInteger> {

    /**
     * Create a new RoleDao without any configuration
     */
    public RoleDao() {
        super(Role.ROLE, io.springboot.jooq.generated.tables.pojos.Role.class);
    }

    /**
     * Create a new RoleDao with an attached configuration
     */
    @Autowired
    public RoleDao(Configuration configuration) {
        super(Role.ROLE, io.springboot.jooq.generated.tables.pojos.Role.class, configuration);
    }

    @Override
    public UInteger getId(io.springboot.jooq.generated.tables.pojos.Role object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.springboot.jooq.generated.tables.pojos.Role> fetchRangeOfId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Role.ROLE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.springboot.jooq.generated.tables.pojos.Role> fetchById(UInteger... values) {
        return fetch(Role.ROLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.springboot.jooq.generated.tables.pojos.Role fetchOneById(UInteger value) {
        return fetchOne(Role.ROLE.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.springboot.jooq.generated.tables.pojos.Role> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Role.ROLE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<io.springboot.jooq.generated.tables.pojos.Role> fetchByName(String... values) {
        return fetch(Role.ROLE.NAME, values);
    }
}
