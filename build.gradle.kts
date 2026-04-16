android {
    defaultConfig {
        versionName "1.0.0"  // ← Du änderst das manuell oder mit GitHub Release
        versionCode 1
# Vor "Build with Gradle" einfügen:
- name: Auto-increment version
  uses: r0adkll/upload-github-release@v1
  if: github.event_name == 'push'
  with:
    tag_name: "v${{ steps.version.outputs.version_name }}"
    }
}
