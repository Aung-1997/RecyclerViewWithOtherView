package com.myanmaritc.myrecview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.myanmaritc.myrecview.Adapter.InfoAdapter
import com.myanmaritc.myrecview.data.Information
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var infoList=ArrayList<Information>()
        infoList.add(Information("My Wishlist",R.drawable.ic_checklist))
        infoList.add(Information("My Followed Sellers",R.drawable.ic_star))
        infoList.add(Information("My Purchased item",R.drawable.ic_shopping_bag))
        infoList.add(Information("My Coupons",R.drawable.ic_to_do_list))
        infoList.add(Information("My Card Wallet",R.drawable.ic_purse))
        infoList.add(Information("My Exp Points",R.drawable.ic_clipboard))
        infoList.add(Information("My Given Feedbacks",R.drawable.ic_clipboard))
        infoList.add(Information("Searched History",R.drawable.ic_to_do_list))
        infoList.add(Information("Events & Calendar",R.drawable.ic_shopping_bag))

        var adapter=InfoAdapter(infoList)
        recyclerView_Grid.layoutManager= GridLayoutManager(this,3)
        recyclerView_Grid.adapter=adapter

    }
}