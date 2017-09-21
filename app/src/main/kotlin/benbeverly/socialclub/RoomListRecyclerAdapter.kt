package benbeverly.socialclub

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater

/**
 * Adapter to display a list of rooms
 */
class RoomListRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mRooms: ArrayList<Room> = ArrayList()
    private var mInflater: LayoutInflater? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (mInflater == null) {
            mInflater = LayoutInflater.from(parent.context)
        }

        val viewBottom = mInflater!!.inflate(R.layout.viewgroup_room, parent, false)
        return RoomViewHolder(viewBottom)
    }

    override fun getItemCount(): Int {
        return mRooms.count()
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder?, position: Int) {
        if (viewHolder is RoomViewHolder) {
            viewHolder.bindRoom(mRooms[position])
        }
    }

    init {
        mRooms.add(Room("Room 1", 0, 1, ""))
        mRooms.add(Room("Room 2", 0, 1, ""))
        mRooms.add(Room("Room 3", 0, 1, ""))
        mRooms.add(Room("Room 4", 0, 1, ""))
        mRooms.add(Room("Room 5", 0, 1, ""))
    }
}