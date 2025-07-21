package de.jessestricker.autoversion.semanticversioning

public class Version(
    public val major: Int,
    public val minor: Int,
    public val patch: Int,
) {
    override fun toString(): String {
        return "$major.$minor.$patch"
    }
}
