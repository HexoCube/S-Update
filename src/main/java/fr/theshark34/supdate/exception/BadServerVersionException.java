/*
 * Copyright 2015 TheShark34
 *
 * This file is part of S-Update.

 * S-Update is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * S-Update is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with S-Update.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.theshark34.supdate.exception;

/**
 * The BadServerVersion Exception
 *
 * <p>
 *     This exception is thrown when the server version is not
 *     the required version, or the server revision are not the required.
 * </p>
 *
 * @version 3.0.0-BETA
 * @author TheShark34
 */
public class BadServerVersionException extends Exception {

    /**
     * The BadServerVersion Exception
     *
     * @param serverVersion
     *            The server version / revision
     */
    public BadServerVersionException(String minVersion, String serverVersion, boolean revisionError) {
        super(revisionError ?
                "Bad server revision, server revision need to be " + minVersion + " but is " + serverVersion :
                "Bad server version, need to be at least " + minVersion + " but is " + serverVersion);
    }

}
