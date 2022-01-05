package co.mudii.dndcharactersheet.models

interface Event {
    var name: String
    var description: String
    var previous: Event
    var posterior: Event
    var characters: MutableList<Character>
    var public: Boolean

    fun share(): Unit
}