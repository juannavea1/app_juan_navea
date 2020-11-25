package com.example.app_juan_navea;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;


        public class SQLiteOpenHelpers extends SQLiteOpenHelper {
            public SQLiteOpenHelpers(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
                super(context, name, factory, version);
            }

            @Override
            public void onCreate(SQLiteDatabase BaseDeDatos) {
                BaseDeDatos.execSQL("create table tarjeta(titular text primary key, apell text, num_tar int, mes int, anio int, cod int, derecedit text, ciudad text, estado text, codpos int)");
            }

            @Override
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            }

        }
