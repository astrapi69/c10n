/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package c10n.tools.inspector.test1;

import c10n.C10NMessages;

/**
 * @author rodion
 * @since 1.1
 */
@SuppressWarnings("ALL")
@C10NMessages
public interface SubInterfaceOfAutoKey extends AutoKey {
    /*
     * key: c10n.tools.inspector.test1.SubInterfaceOfAutoKey.sub_both
     */
    String sub_both();
}
