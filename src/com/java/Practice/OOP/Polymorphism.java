package com.java.Practice.OOP;


import java.util.Scanner;

class Browser {
	public void click() {
		System.out.println("Browser clicking");
	}

	public void mouse() {
		System.out.println("Mouse Browser");
	}
}

	class Chrome extends Browser {
		@Override
		public void click() {
			System.out.println("Chrome clicking");
		}

		@Override
		public void mouse() {
			System.out.println("Mouse chrome");
		}
	}

	class Firefox extends Browser {
		@Override
		public void click() {
			System.out.println("Firefox clicking");
		}

		@Override
		public void mouse() {
			System.out.println("Mouse Firefox");
		}
	}


	public class Polymorphism {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter browser");
			String browser = input.nextLine();

			Browser br = null;

			if (browser.equals("Chrome")) {
				br = new Chrome();
			} else if (browser.equals("Firefox")) {
				br = new Firefox();
			} else {
				throw new RuntimeException("Invalid browser");
			}

			br.click();
			br.mouse();
		}
	}

