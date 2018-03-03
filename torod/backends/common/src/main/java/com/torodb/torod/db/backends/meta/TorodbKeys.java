/*
 *     This file is part of ToroDB.
 *
 *     ToroDB is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General PublicSchema License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     ToroDB is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General PublicSchema License for more details.
 *
 *     You should have received a copy of the GNU Affero General PublicSchema License
 *     along with ToroDB. If not, see <http://www.gnu.org/licenses/>.
 *
 *     Copyright (c) 2014, 8Kdata Technology
 *     
 */
package com.torodb.torod.db.backends.meta;

import com.torodb.torod.db.backends.tables.CollectionsTable;
import com.torodb.torod.db.backends.tables.records.CollectionsRecord;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>torodb</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TorodbKeys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<CollectionsRecord> COLLECTIONS_PKEY = UniqueKeys0.COLLECTIONS_PKEY;
	public static final UniqueKey<CollectionsRecord> COLLECTIONS_SCHEMA_KEY = UniqueKeys0.COLLECTIONS_SCHEMA_KEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<CollectionsRecord> COLLECTIONS_PKEY = createUniqueKey(CollectionsTable.COLLECTIONS, CollectionsTable.COLLECTIONS.NAME);
		public static final UniqueKey<CollectionsRecord> COLLECTIONS_SCHEMA_KEY = createUniqueKey(CollectionsTable.COLLECTIONS, CollectionsTable.COLLECTIONS.SCHEMA);
	}
}
