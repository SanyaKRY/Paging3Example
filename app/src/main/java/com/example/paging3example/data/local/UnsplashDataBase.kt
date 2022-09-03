package com.example.paging3example.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3example.data.local.dao.UnsplashImageDao
import com.example.paging3example.data.local.dao.UnsplashRemoteKeysDao
import com.example.paging3example.model.UnsplashImage
import com.example.paging3example.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDataBase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}