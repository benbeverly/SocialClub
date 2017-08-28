package benbeverly.socialclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private val mRecyclerAdapter: RoomListRecyclerAdapter? = RoomListRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.recycler_room_list)
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        mRecyclerView?.layoutManager = linearLayoutManager
        mRecyclerView?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))
        mRecyclerView?.adapter = mRecyclerAdapter
    }
}
