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

import java.util.Map;

/**
 * An interface for objects that will be returned as part of a ResultSet.
 * 
 * @author Seth Fitzsimmons
 */
public interface Result {
	// TODO add documentId?

	/**
	 * Gets this result's ranking in the resultset.
	 * 
	 * @return Ranking.
	 */
	int getRanking();

	/**
	 * Gets this result's score.
	 * 
	 * @return Score.
	 */
	float getScore();

	/**
	 * Gets this result's search extract.
	 * 
	 * @return Highlighted excerpted field.
	 */
	String getSearchExtract();

	/**
	 * Gets fields that were stored in the index for this result.
	 * 
	 * @return Map containing stored field names and values.
	 */
	Map<String, String> getStoredFields();

	/**
	 * Sets this result's ranking in the resultset.
	 * 
	 * @param ranking Ranking.
	 */
	void setRanking(int ranking);

	/**
	 * Sets this result's score.
	 * 
	 * @param score Score.
	 */
	void setScore(float score);

	/**
	 * Sets this result's search extract.
	 * 
	 * @param extract Highlighted excerpted field.
	 */
	void setSearchExtract(String extract);

	/**
	 * Sets fields that were stored in the index for this result.
	 * 
	 * @param storedFields Stored field names and values.
	 */
	void setStoredFields(Map<String, String> storedFields);
}
