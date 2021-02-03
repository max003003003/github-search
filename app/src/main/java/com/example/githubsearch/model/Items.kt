/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
package com.example.githubsearch.model
import kotlinx.serialization.*
import kotlinx.serialization.json.*
@Serializable
data class Items (

	@SerialName("id") val id : Int,
	@SerialName("node_id") val node_id : String?,
	@SerialName("name") val name : String?,
	@SerialName("full_name") val full_name : String?,
	@SerialName("private") val private : Boolean?,
	@SerialName("owner") val owner : Owner,
	@SerialName("html_url") val html_url : String?,
	@SerialName("description") val description : String?,
	@SerialName("fork") val fork : Boolean?,
	@SerialName("url") val url : String?,
	@SerialName("forks_url") val forks_url : String?,
	@SerialName("keys_url") val keys_urls_url : String?,
	@SerialName("collaborators_url") val collaborators_url : String?,
	@SerialName("teams_url") val teams_url : String?,
	@SerialName("hooks_url") val hooks_url : String?,
	@SerialName("issue_events_url") val issue_events_url : String?,
	@SerialName("events_url") val events_url : String?,
	@SerialName("assignees_url") val assignees_url : String?,
	@SerialName("branches_url") val branches_url : String?,
	@SerialName("tags_url") val tags_url : String?,
	@SerialName("blobs_url") val blobs_url : String?,
	@SerialName("git_tags_url") val git_tags_url : String?,
	@SerialName("git_refs_url") val git_refs_url : String?,
	@SerialName("trees_url") val trees_url : String?,
	@SerialName("statuses_url") val statuses_url : String?,
	@SerialName("languages_url") val languages_url : String?,
	@SerialName("stargazers_url") val stargazers_url : String?,
	@SerialName("contributors_url") val contributors_url : String?,
	@SerialName("subscribers_url") val subscribers_url : String?,
	@SerialName("subscription_url") val subscription_url : String?,
	@SerialName("commits_url") val commits_url : String?,
	@SerialName("git_commits_url") val git_commits_url : String?,
	@SerialName("comments_url") val comments_url : String?,
	@SerialName("issue_comment_url") val issue_comment_url : String?,
	@SerialName("contents_url") val contents_url : String?,
	@SerialName("compare_url") val compare_url : String?,
	@SerialName("merges_url") val merges_url : String?,
	@SerialName("archive_url") val archive_url : String?,
	@SerialName("downloads_url") val downloads_url : String?,
	@SerialName("issues_url") val issues_url : String?,
	@SerialName("pulls_url") val pulls_url : String?,
	@SerialName("milestones_url") val milestones_url : String?,
	@SerialName("notifications_url") val notifications_url : String?,
	@SerialName("labels_url") val labels_url : String?,
	@SerialName("releases_url") val releases_url : String?,
	@SerialName("deployments_url") val deployments_url : String?,
	@SerialName("created_at") val created_at : String?,
	@SerialName("updated_at") val updated_at : String?,
	@SerialName("pushed_at") val pushed_at : String?,
	@SerialName("git_url") val git_url : String?,
	@SerialName("ssh_url") val ssh_url : String?,
	@SerialName("clone_url") val clone_url : String?,
	@SerialName("svn_url") val svn_url : String?,
	@SerialName("homepage") val homepage : String?,
	@SerialName("size") val size : Int?,
	@SerialName("stargazers_count") val stargazers_count : Int?,
	@SerialName("watchers_count") val watchers_count : Int?,
	@SerialName("language") val language : String?,
	@SerialName("has_issues") val has_issues : Boolean?,
	@SerialName("has_projects") val has_projects : Boolean?,
	@SerialName("has_downloads") val has_downloads : Boolean?,
	@SerialName("has_wiki") val has_wiki : Boolean?,
	@SerialName("has_pages") val has_pages : Boolean?,
	@SerialName("forks_count") val forks_count : Int?,
	@SerialName("mirror_url") val mirror_url : String?,
	@SerialName("archived") val archived : Boolean?,
	@SerialName("disabled") val disabled : Boolean?,
	@SerialName("open_issues_count") val open_issues_count : Int?,
	@SerialName("license") val license : License?,
	@SerialName("forks") val forks : Int?,
	@SerialName("open_issues") val open_issues : Int?,
	@SerialName("watchers") val watchers : Int?,
	@SerialName("default_branch") val default_branch : String?,
	@SerialName("score") val score : Double?
)
