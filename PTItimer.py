# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.remote.webelement import WebElement
from selenium import webdriver
import datetime
import unittest, time, re
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

desired_cap = {'browser': 'Firefox','browser_version': '76.0','os': 'OS X','os_version': 'High Sierra','resolution': '1024x768','project': 'PTI','browserstack.debug': 'true'}

driver = webdriver.Remote(command_executor='http://scottmaretick2:MDKicy4nya2192zewKpz@hub.browserstack.com:80/wd/hub',desired_capabilities=desired_cap)
start = time.time()
print start
#driver.get("http://ptisecurity.com/")
driver.get("https://uat.my-canopy.com/#/operations/kpi-dashboard")
driver.find_element_by_xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[1]/input").clear()
driver.find_element_by_xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[1]/input").send_keys("dshaw@ptisecurity.com") #USERNAME
driver.find_element_by_xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[2]/input").clear()
driver.find_element_by_xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[2]/input").send_keys("t5LZwpvHQP")  #PASSWORD
driver.find_element_by_xpath("html/body/div/ui-view/div/div/div/div[1]/form/p[1]/button").click()  #LOGIN
time.sleep(20)
#REPORTING IMAGE
#ADMIN DROPDOWN
driver.find_element_by_xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[2]/a/div/i").click()  #LOCATIONS
time.sleep(20)
#RESET GRID SETTINGS  html/body/div[1]/div[2]/div/div[2]/div[3]/div[2]/button
#FOOTER   html/body/div[1]/footer
driver.find_element_by_xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[3]/a/div/i").click()  #DEVICES
time.sleep(20)
driver.find_element_by_xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[4]/a/div/i").click()  #INCIDENTS
time.sleep(20)
end = time.time()
print end
elapsed_time = end - start
print elapsed_time
driver.quit()
