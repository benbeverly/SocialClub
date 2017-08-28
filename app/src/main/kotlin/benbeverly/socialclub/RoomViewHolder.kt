package benbeverly.socialclub

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * TODO: Describe the class
 */
class RoomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var mRoom: Room? = null
    private val mRoomNameView: TextView = itemView.findViewById(R.id.text_room_name)

    fun bindRoom(room: Room) {
        mRoom = room
        mRoomNameView.text = room.name
    }
}