import groovy.time.*

def timeStart = new Date()

// Codice

def timeStop = new Date()
TimeDuration duration = TimeCategory.minus(timeStop, timeStart)

duration