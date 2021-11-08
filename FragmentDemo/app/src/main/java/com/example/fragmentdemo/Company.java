package com.example.fragmentdemo;

import android.widget.ImageView;

import java.util.ArrayList;

public class Company {
    String name;
    int logo;
    String description;

    public Company(String name, int logo, String description) {
        this.name = name;
        this.logo = logo;
        this.description = description;
    }

    public Company(String name, String des, int image) {
    }


    public static ArrayList<Company> getMockData() {
        String[] names = {"Apple", "Canon", "Debian", "Dribble", "Intel", "Ruby", "Spacex", "Tesla", "Uber", "Vinfast"};
        int[] logos = {R.drawable.apple, R.drawable.canon, R.drawable.debian, R.drawable.dribble, R.drawable.intel, R.drawable.ruby, R.drawable.spacex, R.drawable.tesla, R.drawable.uber, R.drawable.vinfast};
        String[] descriptions = {"Apple Inc., formerly Apple Computer, Inc., American manufacturer of personal computers, smartphones, tablet computers, computer peripherals, and computer software. It was the first successful personal computer company and the popularizer of the graphical user interface.", "The company was originally named Seikikōgaku kenkyūsho (Jpn. 精機光学研究所, Precision Optical Industry Co. Ltd.). In 1934 it produced the Kwanon, a prototype for Japan's first-ever 35 mm camera with a focal-plane-based shutter.[5] In 1947 the company name was changed to Canon Camera Co., Inc.,[5] shortened to Canon Inc. in 1969.", "Debian is a free operating system (OS) for your computer. An operating system is the set of basic programs and utilities that make your computer run. At the core of an operating system is the kernel. The kernel is the most fundamental program on the computer: it does all the basic housekeeping and lets you start other programs.", "Dribbble is a self-promotion and social networking platform for digital designers and creatives.[1] It serves as a design portfolio platform,[2] jobs and recruiting site[3] and is one of the largest platforms for designers to share their work online.[4] The company is fully remote with no headquarters.[5]", "Intel Corporation is an American multinational corporation and technology company headquartered in Santa Clara, California. It is the world's largest semiconductor chip manufacturer by revenue,[3][4] and is the developer of the x86 series of microprocessors, the processors found in most personal computers (PCs).", "A ruby is a pink to blood-red colored gemstone, a variety of the mineral corundum (aluminium oxide). Other varieties of gem-quality corundum are called sapphires. Ruby is one of the traditional cardinal gems, together with amethyst, sapphire, emerald, and diamond.[3]", "Space Exploration Technologies Corp. (SpaceX) is an American aerospace manufacturer, space transportation services and communications corporation headquartered in Hawthorne, California.", "Tesla, Inc. (/ˈtɛslə/ TESS-lə or /ˈtɛzlə/ TEZ-lə[a]) is an American electric vehicle and clean energy company based in Palo Alto, California, United States. The company announced plans to move its headquarters to Austin, Texas. Tesla designs and manufactures electric cars, battery energy storage from home to grid-scale, solar panels and solar roof tiles, and related products and services.", "Uber Technologies, Inc., commonly known as Uber, is an American mobility as a service provider based in San Francisco, with operations in over 900 metropolitan areas worldwide.[3] Its services include ride-hailing, food delivery (Uber Eats and Postmates), package delivery, couriers, freight transportation,[6][7] electric bicycle and motorized scooter rental via a partnership with Lime,[8][9][10][11] and ferry transport in partnership with local operators.[12][13][14][15] Uber does not own any vehicles; instead, it receives a 25% commission from each booking.[16][17] Fares are quoted to the customer in advance but vary using a dynamic pricing model based on the local supply and demand at the time of the booking.[18][19]", "Originating from Vietnam, VinFast is committed to the vision of becoming a global smart EV brand. VinFast has laid the foundation for the electric car and motorbike industry in Vietnam while passionately promoting the worldwide EV revolution."};
        ArrayList<Company> companies = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            companies.add(new Company(names[i], logos[i], descriptions[i]));
        }
        return companies;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLogo() {
        return logo;
    }
}
