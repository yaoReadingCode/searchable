/*
 Copyright 2005-2006 Seth Fitzsimmons <seth@mojodna.net>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package net.mojodna.searchable;

/**
 * Root class for all Exceptions thrown by the searchable toolkit.
 * 
 * @author Seth Fitzsimmons
 */
public abstract class SearchableException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Basic constructor.
	 */
	public SearchableException() {
		super();
	}

	/**
	 * Constructor with message.
	 * 
	 * @param message Error message.
	 */
	public SearchableException(final String message) {
		super(message);
	}

	/**
	 * Constructor with message and cause.
	 * 
	 * @param message Error message.
	 * @param cause Cause of exception.
	 */
	public SearchableException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with cause.
	 * 
	 * @param cause Cause of exception.
	 */
	public SearchableException(final Throwable cause) {
		super(cause);
	}
}
