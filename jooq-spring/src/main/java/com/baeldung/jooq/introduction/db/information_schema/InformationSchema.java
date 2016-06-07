/**
 * This class is generated by jOOQ
 */
package com.baeldung.jooq.introduction.db.information_schema;


import com.baeldung.jooq.introduction.db.information_schema.tables.Catalogs;
import com.baeldung.jooq.introduction.db.information_schema.tables.Collations;
import com.baeldung.jooq.introduction.db.information_schema.tables.ColumnPrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.Columns;
import com.baeldung.jooq.introduction.db.information_schema.tables.Constants;
import com.baeldung.jooq.introduction.db.information_schema.tables.Constraints;
import com.baeldung.jooq.introduction.db.information_schema.tables.CrossReferences;
import com.baeldung.jooq.introduction.db.information_schema.tables.Domains;
import com.baeldung.jooq.introduction.db.information_schema.tables.FunctionAliases;
import com.baeldung.jooq.introduction.db.information_schema.tables.FunctionColumns;
import com.baeldung.jooq.introduction.db.information_schema.tables.Help;
import com.baeldung.jooq.introduction.db.information_schema.tables.InDoubt;
import com.baeldung.jooq.introduction.db.information_schema.tables.Indexes;
import com.baeldung.jooq.introduction.db.information_schema.tables.Locks;
import com.baeldung.jooq.introduction.db.information_schema.tables.QueryStatistics;
import com.baeldung.jooq.introduction.db.information_schema.tables.Rights;
import com.baeldung.jooq.introduction.db.information_schema.tables.Roles;
import com.baeldung.jooq.introduction.db.information_schema.tables.Schemata;
import com.baeldung.jooq.introduction.db.information_schema.tables.Sequences;
import com.baeldung.jooq.introduction.db.information_schema.tables.SessionState;
import com.baeldung.jooq.introduction.db.information_schema.tables.Sessions;
import com.baeldung.jooq.introduction.db.information_schema.tables.Settings;
import com.baeldung.jooq.introduction.db.information_schema.tables.TablePrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.TableTypes;
import com.baeldung.jooq.introduction.db.information_schema.tables.Tables;
import com.baeldung.jooq.introduction.db.information_schema.tables.Triggers;
import com.baeldung.jooq.introduction.db.information_schema.tables.TypeInfo;
import com.baeldung.jooq.introduction.db.information_schema.tables.Users;
import com.baeldung.jooq.introduction.db.information_schema.tables.Views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

	private static final long serialVersionUID = 436617961;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA</code>
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("INFORMATION_SCHEMA");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			QueryStatistics.QUERY_STATISTICS,
			SessionState.SESSION_STATE,
			Locks.LOCKS,
			Sessions.SESSIONS,
			Triggers.TRIGGERS,
			Domains.DOMAINS,
			Constants.CONSTANTS,
			FunctionColumns.FUNCTION_COLUMNS,
			Constraints.CONSTRAINTS,
			CrossReferences.CROSS_REFERENCES,
			InDoubt.IN_DOUBT,
			Views.VIEWS,
			Collations.COLLATIONS,
			ColumnPrivileges.COLUMN_PRIVILEGES,
			TablePrivileges.TABLE_PRIVILEGES,
			Schemata.SCHEMATA,
			FunctionAliases.FUNCTION_ALIASES,
			Rights.RIGHTS,
			Roles.ROLES,
			Users.USERS,
			Sequences.SEQUENCES,
			Help.HELP,
			Settings.SETTINGS,
			Catalogs.CATALOGS,
			TypeInfo.TYPE_INFO,
			TableTypes.TABLE_TYPES,
			Indexes.INDEXES,
			Columns.COLUMNS,
			Tables.TABLES);
	}
}