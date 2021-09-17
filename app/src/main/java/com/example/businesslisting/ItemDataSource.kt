package com.example.businesslisting

class ItemDataSource {
    fun loadBrands(): List<ItemDataModel> {
        return listOf<ItemDataModel>(
            ItemDataModel(R.string.title ,R.string.secondary_text,R.string.supporting_text,R.drawable.mtn_shop),
            ItemDataModel(R.string.title2, R.string.secondary_text2,R.string.supporting_text2,R.drawable.fnb_logo),
            ItemDataModel(R.string.title3, R.string.secondary_text3,R.string.supporting_text3,R.drawable.takealot_2156_1120_1),
            ItemDataModel(R.string.title4, R.string.secondary_text4,R.string.supporting_text4,R.drawable._2634a07_d634_4a3c_855a_1cae83f2170d),

        )
    }
}