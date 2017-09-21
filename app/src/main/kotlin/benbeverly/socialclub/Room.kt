package benbeverly.socialclub

/**
 * Model for holding a chat room's data.
 */
data class Room(val name: String, val membersCounted: Int, val maxMembers: Int, val password: String)
/* val conferenceId: String, val owner: User*/