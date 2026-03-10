package ai.altertable.kotlin.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class IdentifyPayload(
    val environment: String,
    val distinct_id: String,
    val anonymous_id: String? = null,
    val timestamp: String? = null,
    val traits: Map<String, JsonElement>? = null
)

@Serializable
data class IdentifyResponse(
    val ok: Boolean,
    val error_code: String? = null
)

@Serializable
data class TrackPayload(
    val environment: String,
    val event: String,
    val properties: Map<String, JsonElement>,
    val anonymous_id: String? = null,
    val device_id: String? = null,
    val distinct_id: String? = null,
    val session_id: String? = null,
    val timestamp: String? = null
)

@Serializable
data class TrackResponse(
    val ok: Boolean,
    val error_code: String? = null
)

@Serializable
data class AliasPayload(
    val environment: String,
    val distinct_id: String,
    val new_user_id: String
)

@Serializable
data class AliasResponse(
    val ok: Boolean,
    val error_code: String? = null
)
