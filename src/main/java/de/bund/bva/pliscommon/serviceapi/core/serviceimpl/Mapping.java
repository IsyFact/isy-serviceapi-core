/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.pliscommon.serviceapi.core.serviceimpl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.bund.bva.pliscommon.exception.PlisException;
import de.bund.bva.pliscommon.exception.service.PlisToException;

/**
 * Definiert eine Abbildung von einer {@link PlisException} des Anwendungskerns auf eine
 * {@link PlisToException} der Service-Schnittstelle.
 * 
 */
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mapping {

    /**
     * Die {@link PlisException} des Anwendungskerns.
     */
    Class<? extends PlisException> exception();

    /**
     * Die {@link PlisToException} der Service-Schnittstelle.
     */
    Class<? extends PlisToException> toException();

}
