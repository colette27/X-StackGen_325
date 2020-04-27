package io.starter.happypath.model.dao;

import java.sql.JDBCType;
import java.time.OffsetDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HappypathCsatDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.783101-07:00", comments="Source Table: happypath$_csat")
    public static final HappypathCsat happypathCsat = new HappypathCsat();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.783445-07:00", comments="Source field: happypath$_csat.id")
    public static final SqlColumn<Long> id = happypathCsat.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.78396-07:00", comments="Source field: happypath$_csat.user_id")
    public static final SqlColumn<Long> userId = happypathCsat.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784059-07:00", comments="Source field: happypath$_csat.content_id")
    public static final SqlColumn<Long> contentId = happypathCsat.contentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.78415-07:00", comments="Source field: happypath$_csat.comments")
    public static final SqlColumn<String> comments = happypathCsat.comments;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784249-07:00", comments="Source field: happypath$_csat.content_url")
    public static final SqlColumn<String> contentUrl = happypathCsat.contentUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784442-07:00", comments="Source field: happypath$_csat.rating")
    public static final SqlColumn<Long> rating = happypathCsat.rating;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784535-07:00", comments="Source field: happypath$_csat.key_version")
    public static final SqlColumn<Long> keyVersion = happypathCsat.keyVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784662-07:00", comments="Source field: happypath$_csat.key_spec")
    public static final SqlColumn<String> keySpec = happypathCsat.keySpec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784753-07:00", comments="Source field: happypath$_csat.owner_id")
    public static final SqlColumn<Long> ownerId = happypathCsat.ownerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784844-07:00", comments="Source field: happypath$_csat.created_date")
    public static final SqlColumn<OffsetDateTime> createdDate = happypathCsat.createdDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.784936-07:00", comments="Source field: happypath$_csat.modified_date")
    public static final SqlColumn<OffsetDateTime> modifiedDate = happypathCsat.modifiedDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-14T12:17:37.783279-07:00", comments="Source Table: happypath$_csat")
    public static final class HappypathCsat extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<Long> contentId = column("content_id", JDBCType.BIGINT);

        public final SqlColumn<String> comments = column("comments", JDBCType.VARCHAR);

        public final SqlColumn<String> contentUrl = column("content_url", JDBCType.VARCHAR);

        public final SqlColumn<Long> rating = column("rating", JDBCType.BIGINT);

        public final SqlColumn<Long> keyVersion = column("key_version", JDBCType.BIGINT);

        public final SqlColumn<String> keySpec = column("key_spec", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerId = column("owner_id", JDBCType.BIGINT);

        public final SqlColumn<OffsetDateTime> createdDate = column("created_date", JDBCType.TIMESTAMP);

        public final SqlColumn<OffsetDateTime> modifiedDate = column("modified_date", JDBCType.TIMESTAMP);

        public HappypathCsat() {
            super("happypath$_csat");
        }
    }
}