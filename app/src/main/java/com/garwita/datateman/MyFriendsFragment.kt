package com.garwita.datateman

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend( "Samsul Arifin", "Laki-laki", "samsul@stimata.ac.id",
        "081234567", "Bogor"))
        listTeman.add(MyFriend("Dian Wahyuningsih", "Perempuan", "dian@stimata.ac.id",
        "08456789","Sidoarjo"))
        listTeman.add(MyFriend("Erfian Arum", "Perempuan", "erfian@stimata.ac.id",
            "08123456789", "Malang"))
        listTeman.add(MyFriend("Agita Vidiasti", "Perempuan", "agita@stimata.ac.id",
        "0898765432", "Blitar"))
        listTeman.add(MyFriend("Mario Aji", "Laki-laki", "mario@stimata.ac.id",
        "0876543219", "Tulungagung"))
        listTeman.add(MyFriend("Novita Dwi", "Perempuan", "novita@stimata.ac.id",
        "08654789321", "Surabaya"))
        listTeman.add(MyFriend("Putri Rochmatul", "Perempuan", "putri@stimata.ac.id",
        "08321456987", "Pasuruan"))
    }

    @SuppressLint("UseRequireInsteadOfGet")
    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}