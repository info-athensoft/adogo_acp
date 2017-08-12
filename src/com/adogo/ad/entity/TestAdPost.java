package com.adogo.ad.entity;

import java.util.ArrayList;
import java.util.List;

public class TestAdPost {

	private static AdPost adPost;
	
	public static void main(String[] args) {
		init();
		
		List<AdPostCoverImage> list1 = adPost.getListAdPostCoverImage();
		List<AdPostSlideImage> list2 = adPost.getListAdPostSlideImage();
		List<AdPostGalleryImage> list3 = adPost.getListAdPostGalleryImage();
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		AdPostCoverImage a = (AdPostCoverImage)(adPost.getPrimaryMediaObject(list1));
		AdPostSlideImage b = (AdPostSlideImage)(adPost.getPrimaryMediaObject(list2));
		AdPostGalleryImage c = (AdPostGalleryImage)(adPost.getPrimaryMediaObject(list3));
		
		System.out.println(a);
		System.out.println("==========");
		
		System.out.println(b);
		System.out.println("==========");
		
		System.out.println(c);
		System.out.println("==========");

	}
	
	public static void init(){
		adPost = new AdPost();
		
		AdPostCoverImage a1 = new AdPostCoverImage();
			a1.setGlobalId(101L);
			a1.setIsPrimary(true);
		
		AdPostCoverImage a2 = new AdPostCoverImage();
			a2.setGlobalId(102L);
			
		AdPostCoverImage a3 = new AdPostCoverImage();
			a3.setGlobalId(103L);
			
		List<AdPostCoverImage> listAdPostCoverImage = new ArrayList<AdPostCoverImage>();
		listAdPostCoverImage.add(a1);
		listAdPostCoverImage.add(a2);
		listAdPostCoverImage.add(a3);
		
		
		
		
		AdPostSlideImage b1 = new AdPostSlideImage();
			b1.setGlobalId(201L);
			b1.setIsPrimary(true);
		
		AdPostSlideImage b2 = new AdPostSlideImage();
			b2.setGlobalId(202L);
			
		AdPostSlideImage b3 = new AdPostSlideImage();
			b3.setGlobalId(203L);
		
		List<AdPostSlideImage> listAdPostSlideImage = new ArrayList<AdPostSlideImage>();	
		listAdPostSlideImage.add(b1);
		listAdPostSlideImage.add(b2);
		listAdPostSlideImage.add(b3);	
		
		
		
		AdPostGalleryImage c1 = new AdPostGalleryImage();
			c1.setGlobalId(301L);
			c1.setIsPrimary(true);
		
		AdPostGalleryImage c2 = new AdPostGalleryImage();
			c2.setGlobalId(302L);
			
		AdPostGalleryImage c3 = new AdPostGalleryImage();
			c3.setGlobalId(303L);
		
		List<AdPostGalleryImage> listAdPostGalleryImage = new ArrayList<AdPostGalleryImage>();
		listAdPostGalleryImage.add(c1);
		listAdPostGalleryImage.add(c2);
		listAdPostGalleryImage.add(c3);
		
		
		
		adPost.setListAdPostCoverImage(listAdPostCoverImage);
		adPost.setListAdPostSlideImage(listAdPostSlideImage);
		adPost.setListAdPostGalleryImage(listAdPostGalleryImage);
		
	}

}
