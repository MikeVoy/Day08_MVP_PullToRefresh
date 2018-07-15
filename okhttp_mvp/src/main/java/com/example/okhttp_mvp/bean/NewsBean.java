package com.example.okhttp_mvp.bean;

import java.util.List;

public class NewsBean {

    /**
     * date : 20180713
     * stories : [{"title":"这才是我的学生时代，是我想要的爱情","ga_prefix":"071321","images":["https://pic2.zhimg.com/v2-d0bf8e7414cac3e9764c86eda80cea4d.jpg"],"multipic":true,"type":0,"id":9689506},{"images":["https://pic4.zhimg.com/v2-2d673aa6935fca142dc405e642bdbac7.jpg"],"type":0,"id":9689444,"ga_prefix":"071319","title":"靠谱的老板不好遇，能忽悠的却遍地是，到底怎样的老板值得跟？"},{"images":["https://pic3.zhimg.com/v2-1027a5e1c5cb73aacb8fcd1049906e82.jpg"],"type":0,"id":9687821,"ga_prefix":"071318","title":"关于健身，当下有哪些流行的观念是错误的？"},{"images":["https://pic4.zhimg.com/v2-03ac9cfbed193a2724cf66013f5e6e37.jpg"],"type":0,"id":9689524,"ga_prefix":"071317","title":"有哪些体育解说员「打脸」事件？"},{"images":["https://pic3.zhimg.com/v2-00b5d74d5334d99342d3d053f6493e5e.jpg"],"type":0,"id":9689531,"ga_prefix":"071315","title":"中科院成功合成金属氮，看到「N2 炸弹」我以为自己穿越了"},{"images":["https://pic4.zhimg.com/v2-1f912738af631797f2bce912b9d00e53.jpg"],"type":0,"id":9689513,"ga_prefix":"071312","title":"南极发现极高能中微子，动能相当于一枚秒速一米的樱花瓣"},{"images":["https://pic2.zhimg.com/v2-3f2e172f2196229e59b3550e8b402ee1.jpg"],"type":0,"id":9689325,"ga_prefix":"071312","title":"大误 · 星战里的光剑可以穿透美队的盾牌吗？"},{"images":["https://pic4.zhimg.com/v2-077d8280a7e645a8ad8bec6998387973.jpg"],"type":0,"id":9689522,"ga_prefix":"071311","title":"没有任何发布会，苹果官网突然更新了 Macbook Pro"},{"images":["https://pic1.zhimg.com/v2-42069621d0fdbaf008e46b73bd039498.jpg"],"type":0,"id":9689260,"ga_prefix":"071310","title":"遇见美女蛇咋办？"},{"images":["https://pic4.zhimg.com/v2-84dbabb0a296850b1836b2ef0e008fe7.jpg"],"type":0,"id":9689242,"ga_prefix":"071309","title":"比起皮肤上的晒红、晒黑、晒秃噜皮，紫外线对眼球的伤害更阴险"},{"images":["https://pic4.zhimg.com/v2-3212a2829346b9f6f05719439e070e73.jpg"],"type":0,"id":9676217,"ga_prefix":"071308","title":"伴侣道歉时，顺嘴反问「你错哪了」是好的吗？"},{"images":["https://pic3.zhimg.com/v2-84320a649c6994b06b5443dfbb449ffe.jpg"],"type":0,"id":9684736,"ga_prefix":"071307","title":"十年后，比特币价格会是多少？"},{"images":["https://pic2.zhimg.com/v2-3efeee3a3d863e751635ff0420c5ebb5.jpg"],"type":0,"id":9689222,"ga_prefix":"071307","title":"有的动物一夫一妻，有的则有 50 多个「老婆」，哪种更有利于繁衍？"},{"images":["https://pic2.zhimg.com/v2-3493b058327cbf9e2da3d6385e83df99.jpg"],"type":0,"id":9688450,"ga_prefix":"071307","title":"为什么我们对亲近的人反而伤害最深？"},{"images":["https://pic4.zhimg.com/v2-af09db2898dc1e26d5edbf4c980ff2cf.jpg"],"type":0,"id":9689501,"ga_prefix":"071306","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-cccec4844abb86a23de42bfbc407968e.jpg","type":0,"id":9689531,"ga_prefix":"071315","title":"中科院成功合成金属氮，看到「N2 炸弹」我以为自己穿越了"},{"image":"https://pic2.zhimg.com/v2-c8411589388d6da0a5fa410a0b72a4d1.jpg","type":0,"id":9689524,"ga_prefix":"071317","title":"有哪些体育解说员「打脸」事件？"},{"image":"https://pic3.zhimg.com/v2-2345a00e82d7a4add8cb68df55175e6e.jpg","type":0,"id":9689522,"ga_prefix":"071311","title":"没有任何发布会，苹果官网突然更新了 Macbook Pro"},{"image":"https://pic4.zhimg.com/v2-ca3c2c11a3891f802b68a533a5bf399f.jpg","type":0,"id":9689513,"ga_prefix":"071312","title":"南极发现极高能中微子，动能相当于一枚秒速一米的樱花瓣"},{"image":"https://pic3.zhimg.com/v2-6dfcda1d25e6f0d1f2d892cc5fe4b546.jpg","type":0,"id":9689444,"ga_prefix":"071319","title":"靠谱的老板不好遇，能忽悠的却遍地是，到底怎样的老板值得跟？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 这才是我的学生时代，是我想要的爱情
         * ga_prefix : 071321
         * images : ["https://pic2.zhimg.com/v2-d0bf8e7414cac3e9764c86eda80cea4d.jpg"]
         * multipic : true
         * type : 0
         * id : 9689506
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "StoriesBean{" +
                    "title='" + title + '\'' +
                    ", ga_prefix='" + ga_prefix + '\'' +
                    ", multipic=" + multipic +
                    ", type=" + type +
                    ", id=" + id +
                    ", images=" + images +
                    '}';
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic3.zhimg.com/v2-cccec4844abb86a23de42bfbc407968e.jpg
         * type : 0
         * id : 9689531
         * ga_prefix : 071315
         * title : 中科院成功合成金属氮，看到「N2 炸弹」我以为自己穿越了
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

}
