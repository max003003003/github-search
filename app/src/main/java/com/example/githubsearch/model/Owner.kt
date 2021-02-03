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
data class Owner (

	@SerialName("login") val login : String?,
	@SerialName("id") val id : Int,
	@SerialName("node_id") val node_id : String?,
	@SerialName("avatar_url") val avatar_url : String?,
	@SerialName("gravatar_id") val gravatar_id : String?,
	@SerialName("url") val url : String?,
	@SerialName("html_url") val html_url : String?,
	@SerialName("followers_url") val followers_url : String?,
	@SerialName("following_url") val following_url : String?,
	@SerialName("gists_url") val gists_url : String?,
	@SerialName("starred_url") val starred_url : String?,
	@SerialName("subscriptions_url") val subscriptions_url : String?,
	@SerialName("organizations_url") val organizations_url : String?,
	@SerialName("repos_url") val repos_url : String?,
	@SerialName("events_url") val events_url : String?,
	@SerialName("received_events_url") val received_events_url : String?,
	@SerialName("type") val type : String?,
	@SerialName("site_admin") val site_admin : Boolean?
)
