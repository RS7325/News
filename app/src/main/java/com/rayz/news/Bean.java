package com.rayz.news;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */

public class Bean  {
    private List<Data> data;

    public Bean(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Bean(){
        super();
    }

    @NotNull
    @Override
    public String toString() {
        return "Bean{" +
                "data=" + data +
                '}';
    }

    public class Data{
        private int id;
        private int activityPrice;
        private String efficacy;
        private String goods_img;
        private String goods_name;
        private int market_price;
        private int sales_volume;
        private int shop_price;

        public Data(int id, int activityPrice, String efficacy, String goods_img, String goods_name, int market_price, int sales_volume, int shop_price) {
            this.id = id;
            this.activityPrice = activityPrice;
            this.efficacy = efficacy;
            this.goods_img = goods_img;
            this.goods_name = goods_name;
            this.market_price = market_price;
            this.sales_volume = sales_volume;
            this.shop_price = shop_price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getActivityPrice() {
            return activityPrice;
        }

        public void setActivityPrice(int activityPrice) {
            this.activityPrice = activityPrice;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public int getMarket_price() {
            return market_price;
        }

        public void setMarket_price(int market_price) {
            this.market_price = market_price;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public int getShop_price() {
            return shop_price;
        }

        public void setShop_price(int shop_price) {
            this.shop_price = shop_price;
        }
        public Data(){
            super();
        }

        @NotNull
        @Override
        public String toString() {
            return "Data{" +
                    "id=" + id +
                    ", activityPrice=" + activityPrice +
                    ", efficacy='" + efficacy + '\'' +
                    ", goods_img='" + goods_img + '\'' +
                    ", goods_name='" + goods_name + '\'' +
                    ", market_price=" + market_price +
                    ", sales_volume=" + sales_volume +
                    ", shop_price=" + shop_price +
                    '}';
        }
    }
}

