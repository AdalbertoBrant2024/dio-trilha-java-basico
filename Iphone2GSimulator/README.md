---
title: UML IPhone Santander 2024 DIO
---
classDiagram

    class Device {
        +Boolean isOn
        +powerOn()
        +powerOff()
    }

    class Iphone 2G{
        +String currentTrack
        +String currentCall
        +String currentURL
        +play()
        +pause()
        +selectTrack(String music)
        +call(String numero)
        +pickUp()
        +startVoiceMail()
        +showWeb(String url)
        +addNewTab()
        +reloadPage()
    }

    class MusicPlayer{
        +play()
        +pause()
        +selectTrack(String music)
    }

    class Phone{
        
        +call(String numero)
        +pickUp()
        +startVoiceMail()
    }

    class InternetBrowser{
        
        +showWeb(String url)
        +addNewTab()
        +reloadPage()
    }

    Device <|-- Iphone 2G
    Iphone 2G ..|> MusicPlayer
    Iphone 2G ..|> Phone
    Iphone 2G ..|> InternetBrowser

