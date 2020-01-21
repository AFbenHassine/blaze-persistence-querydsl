package com.pallasathenagroup.querydsl;

import com.blazebit.persistence.KeysetPage;
import com.blazebit.persistence.PagedList;
import com.mysema.commons.lang.CloseableIterator;
import com.querydsl.core.NonUniqueResultException;
import com.querydsl.core.QueryMetadata;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.Visitor;

import javax.annotation.Nullable;
import java.util.List;

public class UnionImpl<T, Q extends AbstractBlazeJPAQuery<T, Q>> implements Union<T> {

    private final Q query;

    public UnionImpl(Q query) {
        this.query = query;
    }

    @Override
    public PagedList<T> fetchPage(int firstResult, int maxResults) {
        return query.fetchPage(firstResult, maxResults);
    }

    @Override
    public PagedList<T> fetchPage(KeysetPage keysetPage, int firstResult, int maxResults) {
        return query.fetchPage(keysetPage, firstResult, maxResults);
    }

    @Override
    public List<T> fetch() {
        return query.fetch();
    }

    @Override
    public T fetchFirst() {
        return query.fetchFirst();
    }

    @Override
    public T fetchOne() throws NonUniqueResultException {
        return query.fetchOne();
    }

    @Override
    public CloseableIterator<T> iterate() {
        return query.iterate();
    }

    @Override
    public QueryResults<T> fetchResults() {
        return query.fetchResults();
    }

    @Override
    public long fetchCount() {
        return query.fetchCount();
    }

    @Override
    public QueryMetadata getMetadata() {
        return query.getMetadata();
    }

    @Nullable
    @Override
    public <R, C> R accept(Visitor<R, C> v, @Nullable C context) {
        return query.accept(v, context);
    }

    @Override
    public Class<? extends T> getType() {
        return query.getType();
    }

}