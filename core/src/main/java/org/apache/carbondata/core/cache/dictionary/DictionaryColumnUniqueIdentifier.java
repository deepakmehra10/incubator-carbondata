/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.carbondata.core.cache.dictionary;

import org.apache.carbondata.core.carbon.CarbonTableIdentifier;
import org.apache.carbondata.core.carbon.ColumnIdentifier;
import org.apache.carbondata.core.carbon.metadata.datatype.DataType;

/**
 * dictionary column identifier which includes table identifier and column identifier
 */
public class DictionaryColumnUniqueIdentifier {

  /**
   * table fully qualified name
   */
  private CarbonTableIdentifier carbonTableIdentifier;

  /**
   * unique column id
   */
  private ColumnIdentifier columnIdentifier;

  private DataType dataType;

  /**
   * Will be used in case of reverse dictionary cache which will be used
   * in case of data loading.
   *
   * @param carbonTableIdentifier
   * @param columnIdentifier
   */
  public DictionaryColumnUniqueIdentifier(CarbonTableIdentifier carbonTableIdentifier,
      ColumnIdentifier columnIdentifier) {
    this.carbonTableIdentifier = carbonTableIdentifier;
    this.columnIdentifier = columnIdentifier;
  }

  /**
   * Will be used in case of forward dictionary cache in case
   * of query execution.
   *
   * @param carbonTableIdentifier
   * @param columnIdentifier
   * @param dataType
   */
  public DictionaryColumnUniqueIdentifier(CarbonTableIdentifier carbonTableIdentifier,
      ColumnIdentifier columnIdentifier, DataType dataType) {
    this(carbonTableIdentifier, columnIdentifier);
    this.dataType = dataType;
  }

  public DataType getDataType() {
    return dataType;
  }

  /**
   * @return table identifier
   */
  public CarbonTableIdentifier getCarbonTableIdentifier() {
    return carbonTableIdentifier;
  }

  /**
   * @return columnIdentifier
   */
  public ColumnIdentifier getColumnIdentifier() {
    return columnIdentifier;
  }

  /**
   * overridden equals method
   *
   * @param other
   * @return
   */
  @Override public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    DictionaryColumnUniqueIdentifier that = (DictionaryColumnUniqueIdentifier) other;
    if (!carbonTableIdentifier.equals(that.carbonTableIdentifier)) return false;
    return columnIdentifier.equals(that.columnIdentifier);

  }

  /**
   * overridden hashcode method
   *
   * @return
   */
  @Override public int hashCode() {
    int result = carbonTableIdentifier.hashCode();
    result = 31 * result + columnIdentifier.hashCode();
    return result;
  }
}
