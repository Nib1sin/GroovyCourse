import groovy.time.TimeCategory 
import groovy.time.TimeDuration

Date start = new Date('02/27/2019')
Date stop = new Date()

TimeDuration td = TimeCategory.minus(stop, start)

